#include<iostream>
#include<vector>

using namespace std; 

vector<string> subSequence(string str){
    vector<string> ans; // if you donot know the size toh aes likhte h
    ans.push_back("");

    for(int i=0; i<str.length(); i++){
        char ch= str[i];
        int size=ans.size();
        for(int j=0; j<size; j++){
            ans.push_back(ans[j] + ch);
        }
    }
    return ans;
}
int main(int argc, char **argv){
   
    string str;
    cin>>str;
    
    vector<string> ans = subSequence(str);
    
    string str1 = "[";
    int idx = 0;
    for (string ele : ans){
        str1 += ele;
        if(idx < ans.size() - 1) str1 += ", ";
        idx++;
    }
    
    cout << str1 + "]";
    return 0;
}