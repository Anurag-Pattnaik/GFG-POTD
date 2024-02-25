//{ Driver Code Starts
// Driver Code
#include<bits/stdc++.h>
#define ll long long int
using namespace std;

// } Driver Code Ends

class Solution
{
    public:
    // Complete this function
    long long int count(long long int n)
    {
    	// Your code here
    	ll ans=0;
    	for(int i=0;i<=n;i+=3)
    	{
    	    ans+=(n-i)%5 ? 0 : (n-i)/10+1;
    	}
    	return ans;
    	
    }
};

//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		ll n;
		cin>>n;
		Solution obj;
		cout<<obj.count(n)<<endl;
	}
	return 0;
}
// } Driver Code Ends