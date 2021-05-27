#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void inverseArray(vector<int>& arr, int idx){
    if(idx==arr.size()) return;
    int val = arr[idx];
    inverseArray(arr, idx+1);
    arr[val]=idx;
}
int main() {
    int n; cin>>n;
    vector<int> arr(n,0);
    for(int i=0; i<n; i++) cin>>arr[i];
    int idx; cin>>idx;
   
    inverseArray(arr,0);
    for(int ele : arr) cout<< ele <<" ";
    cout<<endl;
    cout<<arr[idx]<<endl;
    return 0;
}