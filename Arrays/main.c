#include<stdio.h>
void main(){
    int k,v;
    k=(v=20,v++,v+2);
    printf("%d",k);
}

// o/p:-22

// #include<stdio.h>
// int main(){
//      int i;
//      for(i=0;i<5;i++){
//         int i=10;
//         printf("%d",i);
//         i++;
//      }
//     return 0;
// }

// o/p=1010101010