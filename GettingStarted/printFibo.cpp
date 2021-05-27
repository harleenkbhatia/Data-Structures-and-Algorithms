#include<iostream>
using namespace std;
  
void printFibo(int n){
      int a=0, b=1;
      for(int i=1; i<=n; i++){
          cout<<a<<endl;
          int sum=a+b;
          a=b;
          b=sum;
      }
  }
int main(int argc, char **argv) {
      // write your code here
      int n;
      cin>>n;
      printFibo(n);
   }
  