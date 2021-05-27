#include<iostream>
#include<string>
using namespace std;

string solution(string str) {
    
    if(str.length() <= 1) return str;
    
    string ans= "";
    ans += str[0];
    for(int i=1; i<str.length(); i++){
        char ch0=str[i-1];
        char ch1=str[i];
        ans += to_string (ch1-ch0);
        ans +=  ch1;
    }
    return ans;
}
int main(int argc, char **argv) {
    
    string str;
    cin>>str;
    cout<<solution(str);

    return 0;
}

