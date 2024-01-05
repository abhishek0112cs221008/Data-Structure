#include<stdio.h>

void printArr(int arr[],int size){
    for(int i=0;i<size;i++){
    printf("%d ",arr[i]);
    }
    printf("\n");
}

int main(){
    int arr[5],i;
    int size = (sizeof(arr)/sizeof(arr[0]));
    printf("Enter teh 5 Integer value :");

    for(i=0;i<size;i++){
        scanf("%d ",&arr[i]);
    }

    printf("You insert integers :\n");
    printArr(arr,size);

    return 0;
}