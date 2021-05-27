#include <iostream>
using namespace std;

int CountDigits(int n){
         int num = n;
         int count =0;
       while(num>0){
           
  
           num /= 10;
           count++;
       }  
    return count;
}
    void printDigits(int n){
        int num = n;
        int len = CountDigits(num);
        int div =1;
        while(len-- > 1){
            div *= 10;
        }
        while(div != 0){
            cout<<(n/div)<<endl;
            n = n%div;
            div /= 10;
        }
        
    }
int main(int argc, char **argv){
    int n;
    cin >> n;
    printDigits(n);

    //write your code here
    
}
