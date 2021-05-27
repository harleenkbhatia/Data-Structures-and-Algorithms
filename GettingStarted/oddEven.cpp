#include<iostream>
using namespace std;

void oddEven(int x){
    if(x%2==0){
        cout<<to_string(x) + " is Even"<<endl;
        }
    else{
        cout<<to_string(x) + " is Odd"<<endl;
        }
    }
void checkOddEven(){
    int m; cin>>m;
    for (int i=1; i<=m; i++){
        int a; cin>>a;
        oddEven(a);
        }
    }
    int main()
    {
        checkOddEven();
        return 0;
    }
    
