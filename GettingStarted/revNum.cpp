#include <iostream>
using namespace std;
void revNum(int n){
    int num=n;
    while(num>0){
        int res = num%10;
        cout<<res<<endl;
        num /= 10;
    }
}
int main(int argc, char **argv){
    int n;
    cin >> n;
    revNum(n);
    //write your code here
    
}