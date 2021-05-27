#include<iostream>
using namespace std;
void belgianBulbs(int n){
    for(int i=1; i * i <= n; i++){
        cout<< i*i <<endl;
    }
}
int main(int argc, char**argv){
    int n;
    cin>>n;
    belgianBulbs(n);
    //write your code here
    
}