#include<iostream>
#include<vector>
using namespace std;

void display(vector<int>& arr){
    for(int i=0; i < arr.size(); i++){
        cout<<arr[i]<<" ";
    }
}
void test1(){
    int n; cin >> n;
    vector<int> arr(n);

    for(int i=0; i < n; i++){
        cin >> arr[i];
    }

    display(arr);
}
void test2(){
        vector <int> arr(10,8);
        display(arr);
    }
int main(int argc, char **argv){
    test2();
    return 0;
}