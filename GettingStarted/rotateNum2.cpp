//in this code when r=+ive no. we are taking the last r nos. ahead.
#include<iostream>
#include<cmath>

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
        if(i<=k) div *= 10;
        else mul *= 10;
    }
    int A = n/div;
    int B = n%div;

    return (B * mul) + A;
    }
    
int main(){
    int n,k;
    cin>>n>>k;
    cout<<rotateDigits(n,k);
    //write your code here

}