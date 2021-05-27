#include <iostream>
using namespace std;

int countDigits(int n){
    int count=0;
    int num=n;
    while(num!=0){
        num/=10;
        count++;
    }
    return count;
}

int main(int argc, char **argv){
    int n;
    cin >> n;
    cout<<countDigits(n)<<endl;
    
}