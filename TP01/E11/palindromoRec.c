#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

bool isPaliRecursive(char *input, int left, int right) 
{
    if (left >= right) {
        return true;
    }

    char leftChar = input[left];
    char rightChar = input[right];

    if (!isalpha(leftChar)) {
        return isPaliRecursive(input, left + 1, right);
    }

    if (!isalpha(rightChar)) {
        return isPaliRecursive(input, left, right - 1);
    }

    if (leftChar != rightChar) {
        return false;
    }

    return isPaliRecursive(input, left + 1, right - 1);
}

bool isPali(char *input) 
{
    int length = strlen(input);
    return isPaliRecursive(input, 0, length - 1);
}

bool isFim(char *buffer)
{
    return strncmp(buffer, "FIM", 3) == 0;
}

void isPaliPrint(char *line)
{
    if (isPali(line))
    {
        printf("SIM\n");
    }
    else
    {
        printf("NAO\n");
    }
}

int main() 
{
    char line[100]; // Adjust the size as needed
    fgets(line, sizeof(line), stdin);

    while (!isFim(line))
    {
        isPaliPrint(line);
        fgets(line, sizeof(line), stdin);
    }

    return 0;
}
