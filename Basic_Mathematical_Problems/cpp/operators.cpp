// SOLVED IN GEEKS FOR GEEKS
// PROBLEM NAME : C++ Operators | Set 1 (Arithmetic)

//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class operators
{
public:
    vector<int> cppOperators(int A, int B)
    {
        int sum = A + B;
        int mul = A * B;
        int sub, divi;
        if (A > B)
        {
            sub = A - B;
            if (B != 0)
                divi = A / B;
            else
                divi = 0; // or handle the division by zero error appropriately
        }
        else
        {
            sub = B - A;
            if (A != 0)
                divi = B / A;
            else
                divi = 0; // or handle the division by zero error appropriately
        }

        std::vector<int> result;
        result.push_back(sum);
        result.push_back(mul);
        result.push_back(sub);
        result.push_back(divi);

        return result;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int A, B;
        cin >> A >> B;
        operators ob;
        vector<int> ans = ob.cppOperators(A, B);
        for (int u : ans)
            cout << u << "\n";
    }
}
// } Driver Code Ends

/*

INPUT:
2
1 2
5 7
OUTPUT:
3 2 1 2
12 35 2 1

*/