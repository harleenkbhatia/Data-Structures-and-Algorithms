//in this code when r=+ive no. we are taking the 1st r nos. behind.
#include<iostream>
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
int rotateDigits(int n, int k){
    int len= countDigits(n);
    k %= len;
    if(k<0) k = (k + len) % len;

    int mul=1, div=1;
    for(int i=1; i<=len; i++){
        if(i<=k) mul *= 10;
        else div *= 10;
    }
    int A = n/div;
    int B = n%div;

    return (B * mul) + A;
    }

int main(int argc, char **argv){
    int n;
    cin >> n;
    cout<<countDigits(n)<<endl;
    
}
