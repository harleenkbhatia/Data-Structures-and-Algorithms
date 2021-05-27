#include<iostream>
using namespace std;
void printTable(int n){
    for(int i=1; i<=10; i++){
        cout<<to_string(n)+" X "+to_string(i)+" = "+to_string(n*i)<<endl;
    }
}
void printTableTillN(int n){
    for(int i=1; i<=n; i++){
        printTable(i);
        cout<<endl;
    }
}
int main(){
    int n;
    cin>>n;
    printTableTillN(n);
}