#include <iostream>
using namespace std;

bool isPrime_(int n){ 
    bool prime=true;
    for(int i=2; i * i <= n ; i++){
        if(n%i==0){
            prime=false;
            break;
            
        }
    }
    return prime;
}

void printAllPrime(int a,  int b){
        for(int i=a; i<=b ; i++){
            bool ans= isPrime_(i);
            if(ans) cout << i << endl;
            
        }
    }
int main(int argc, char **argv){
    int low, high;
    cin >> low >> high;
    printAllPrime(low, high);
    
}