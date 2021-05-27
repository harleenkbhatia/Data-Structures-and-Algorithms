#include <iostream>
using namespace std;

bool isPrime_(int n){ 
    bool prime=true;
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            prime=false;
            break;
            
        }
    }
    return prime;
}
void isPrime(){
    int n;
    cin>>n;
    bool ans= isPrime_(n);
    
    if(ans) cout<<"prime"<<endl;
    else cout<<"not prime"<<endl;
}
int main(int argc, char **argv){
    int t;
    cin >> t;
    while(t-->0){
        isPrime();
    }
    
}
 /* bool is a function that says true or false*/