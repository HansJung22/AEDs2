#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
	char buffer[1000];
	char* actBuffer;
	
	printf("Escreva: ");
	fgets(buffer, 1000, stdin);

	actBuffer = (char*) malloc((sizeof(buffer)*sizeof(char))+1);
	strcpy(actBuffer, buffer);
	
	printf("Escreveu: %s", actBuffer);

	free(actBuffer);
	return 0;
}
