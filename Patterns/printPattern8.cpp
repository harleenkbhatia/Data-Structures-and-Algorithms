#include <iostream>
using namespace std;
void pattern8(int row){
    int nst=1;
    int nsp=row-1;
    for(int r=1; r<=row; r++){
        for(int csp=1; csp<=nsp; csp++){
            cout<<"\t";
        }
        for(int cst=1; cst<=nst; cst++){
            cout<<"*\t";
        }
        
        nsp--;
        cout<<endl;
    }
}
int main(int argc, char **argv){
    int n;
    cin >> n;
    pattern8(n);
    //write your code here
    
}