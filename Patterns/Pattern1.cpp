#include <iostream>
using namespace std;
void pattern1(int row){
    int nst=1;
    for(int r=1; r<=row; r++){
        for(int cst=1; cst<=nst; cst++){
        cout<<"*\t";
            
        }
        nst++;
        cout<<endl;
        
    }
}
int main(int argc, char **argv){
    int n;
    cin >> n;
    pattern1(n);
   //write your code here
   
}