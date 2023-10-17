import logging
# Configure logging
logging.basicConfig(filename='app.log', 
                    level=logging.DEBUG, 
                    format='%(asctime)s - %(name)s - %(levelname)s - %(message)s')

def divide_numbers(a, b):
    try:
        result = a / b
    except ZeroDivisionError as e:
        # Log the error
        logging.error(f"Division by zero: {e}")
        result = None
    except Exception as e:
        # Log other exceptions
        logging.error(f"An error occurred: {e}")
        result = None
    return result

if __name__ == '__main__':
    a = 10
    b = 0

    result = divide_numbers(a, b)

    if result is not None:
        print(f"Result: {result}")
    else:
        print("An error occurred. Check the log for details.")

