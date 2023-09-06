#include <stdio.h>

int num1, num2;

int add(int a, int b);
int sub(int a, int b);
int mul(int a, int b);
int div(int a, int b);
void setInput();



int main()
{
    int choice;
    int num1, num2;

    printf("Calculator\n");
    printf("==========\n");
    printf("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\n");
    scanf("%d", &choice);

    while (choice != 5)
    {
        setInput();

        switch (choice)
        {
        case 1:
            printf("Result: %d\n", add(num1, num2));
            break;
        case 2:
            printf("Result: %d\n", sub(num1, num2));
            break;
        case 3:
            printf("Result: %d\n", mul(num1, num2));
            break;
        case 4:
            printf("Result: %d\n", div(num1, num2));
            break;

        default:
            printf("Invalid choice\n");
            break;
        }

        printf("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit\n");
        scanf("%d", &choice);
    }

    return 0;
}

int add(int a, int b)
{
    int result = a + b; 
    return result;
}

int sub(int a, int b)
{
    int result = a - b; 
    return result;
}

int mul(int a, int b)
{
    int result = a * b; 
    return result;
}

int div(int a, int b)
{
    if (b == 0)
    {
        printf("Error! Cannot divide by zero");
        return -1;
    }
    int result = a / b; 
    return result;
}

void setInput()
{
    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);
}
