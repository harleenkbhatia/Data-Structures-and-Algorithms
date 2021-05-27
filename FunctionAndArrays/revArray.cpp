#include<iostream>
#include<vector>

using namespace std;


void reverse(vector<int>& arr) {
        int si = 0, ei = arr.size() - 1;
        while (si < ei) {
            swap(arr[si++], arr[ei--]);
        //starting index-si, ending index-ei
        //cpp has an inbuilt swap function that swaps the values.
    }
}

int main(int argc, char **argv){
    
    int n; cin>>n;
    vector < int > arr(n);
    for(int i; i<n; i++) cin>>arr[i];
    reverse(arr);
    for(int ele : arr) cout<<ele<<" ";
    
    return 0;
}


