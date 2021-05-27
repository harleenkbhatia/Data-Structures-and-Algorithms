#include <iostream>
using namespace std;
void pattern4(int row){
    int nst=row;
    int nsp=0;
    for(int r=1; r<=row; r++){
        for(int csp=1; csp<=nsp; csp++){
            cout<<"\t";
        }
        for(int cst=1; cst<=nst; cst++){
            cout<<"*\t";
        }

        nsp++;
        nst--;
        cout<<endl;
    }
}
int main(int argc, char **argv){
    int n;
    cin >> n;
    pattern4(n);
    //write your code here

}