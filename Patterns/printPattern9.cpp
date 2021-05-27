#include<iostream>
using namespace std;
void printPattern9(int row){
    for(int i=1; i<=row; i++){
        for(int j=1; j<=row; j++){
            if( i==j || i+j==row+1 ){
                cout<<"*\t";
            }
            else{
                cout<<"\t";
            }
            
        }
        cout<<endl;
    }
}
int main(int argc, char **argv){
    int n;
    cin>>n;
    printPattern9(n);
}