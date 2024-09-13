#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, processTimeA, processTimeB;

    cin >> n >> processTimeA >> processTimeB;

    vector<int> data(n);
    for (int i = 0; i < n; i++) {
        cin >> data[i];
    }

    sort(data.begin(), data.end(), greater<int>());

    int totalTimeA = 0, totalTimeB = 0;
    for (int i = 0; i < n; i++) {

        int timeIfA = totalTimeA + data[i] * processTimeA;
        int timeIfB = totalTimeB + data[i] * processTimeB;

        if (timeIfA <= timeIfB) {
            totalTimeA = timeIfA;
        } else {
            totalTimeB = timeIfB;
        }
    }

 
    cout << max(totalTimeA, totalTimeB) << endl;

    return 0;
}
