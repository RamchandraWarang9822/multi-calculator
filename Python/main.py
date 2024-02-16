def calculate(expression):
    return eval(expression)


def main():
    print("Welcome to Python Calculator")
    print("Use exit() to exit from calculator")
    while True:
        try:
            expression = input("Enter the number with operator: ")

            if expression == "exit()":
                print("Exiting Calculator...")
                break

            result = calculate(expression)
            print("Result: ", result)
        except Exception as e:
            print("Error:", e)


if __name__ == "__main__":
    main()