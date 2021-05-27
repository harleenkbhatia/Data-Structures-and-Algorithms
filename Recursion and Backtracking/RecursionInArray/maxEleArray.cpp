#include<iostream>
#include<vector>

using namespace std;

int maxEleArray(vector <int> & arr, int idx){
    if(idx==arr.size()) return -1e9;

    return max(arr[idx], maxEleArray(arr, idx+1));
}

int main(){
    int n; cin>>n;
    vector<int>arr(n,0);
    for(int i=0; i<n; i++) cin>>arr[i];

    cout<<maxEleArray(arr,0)<<endl;
    return 0;    
}