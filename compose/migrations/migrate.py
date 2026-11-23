import psycopg2
from dotenv import load_dotenv
import sys
import os
import time

def run_sql_script(sql_file):
    try:
        conn = psycopg2.connect(
            host=os.getenv("DB_HOST"),
            port=int(os.getenv("DB_PORT", 1111)),
            user=os.getenv("DB_USER"),
            password=os.getenv("DB_PASS"),
            database=os.getenv("DB_DATABASE")
        )

        with open(sql_file, 'r', encoding='utf-8') as f:
            sql_script = f.read()

        cursor = conn.cursor()
        for statement in sql_script.split(';'):
            stmt = statement.strip()
            if stmt:
                cursor.execute(stmt)

        conn.commit()
    finally:
        if conn:
            cursor.close()
            conn.close()


if __name__ == "__main__":
    load_dotenv('credentials.env')

    for file in ["create.sql", "initial_values.sql"]:
        run_sql_script(file)
