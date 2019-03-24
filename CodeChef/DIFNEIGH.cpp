#include <bits/stdc++.h>

using namespace std;

struct node {
    int data;
    bool visited;

    node() {
        data = 1;
        visited = false;
    }
};


void diff_neighbours(node** arr, int N, int M) {
    vector<string> q;

    if(N == 1 && M == 1) {
        cout << 1 << "\n";
        cout << 1 << "\n";
        return;
    }
    else if(N == 1) {
        q.push_back("0 1");
    }
    else if(M == 1) {
        q.push_back("1 0");
    }
    else {
        q.push_back("0 1");
        q.push_back("1 0");
        arr[1][0].data = 2;
    }

    while(!q.empty()) {
        vector< pair<string, int> > m;
        string ele = q.front();
        char ar[ele.length() + 1];
        strcpy(ar, ele.c_str());
        // q.erase(q.begin());

        char token1 = *strtok(ar, " ");
        int row = token1 - '0';
        int row_copy = row;
        cout << "Row: " << row << "\n";
        token1 = *strtok(NULL, " ");
        int col = token1 - '0';
        int col_copy = col;
        cout << "Col: " << col << "\n";

        arr[row][col].visited = true;

        vector<string> nei;

        for(int i = 0; i < 4; i++) {
            if(i == 3) {
                row = row_copy;
                col = col_copy;
                row = row - 1;
            }
            else if(i == 2) {
                row = row_copy;
                col = col_copy;
                col = col - 1;
            }
            else if(i == 0) {
                row = row_copy;
                col = col_copy;
                col = col + 1;
            }
            else {
                row = row_copy;
                col = col_copy;
                row = row + 1;
            }
            cout << "Row1: " << row << "\n";
            cout << "Col1: " << col << "\n";
            if((row >= 0 && row < N) && (col >= 0 && col < M) && (row != row_copy || col != col_copy)) {
                string index = to_string(row) + " " + to_string(col);
                cout << "Neighbour of " << ele << ": " << index << "\n";
                if(m.find(index) == m.end()) {
                    m[index] = arr[row][col].data;
                    nei.push_back(index);
                }
            }
        }


        unordered_map<string, int>::iterator it = m.begin();

        vector<string> v;
        cout << "Hashmap: " << "\n";
        int same, same1 = -1, prev = 1;
        for(it = m.begin(); it != m.end(); it++) {
            char ar1[ele.length() + 1];
            strcpy(ar1, it->first.c_str());
            token1 = *strtok(ar1, " ");
            row = token1 - '0';
            // int row_copy = row;
            // cout << "Row: " << row << "\n";
            token1 = *strtok(NULL, " ");
            col = token1 - '0';
            // int col_copy = col;

            if(it == m.begin())
                same = it->second;
            else {
                if(it->second == same) {
                    while(true) {
                        int flag = 0;
                        for(unordered_map<string, int>::iterator it1 = m.begin(); it1 != m.end(); it1++) {
                            int val = it1->second;
                            if(prev+1 == val && it1->first != it->first) {
                                flag = 1;
                                break;
                            }
                        }
                        if(flag == 0) {
                            arr[row][col].data = prev+1;
                            break;
                        }
                        prev++;
                    }
                }
                // else if(it == ++m.begin()){
                //     same1 = it->second;
                // }
                // else {
                //     same = it->second;
                // }
            }

            if(arr[row][col].visited == false) {
                string index = to_string(row) + " " + to_string(col);
                q.push_back(index);
            }

            cout << it->first << " = " << it->second << "\n";
        }

        cout << "Array: " << "\n";
        for(int j = 0; j < N; j++) {
            for(int k = 0; k < M; k++) {
                cout << arr[j][k].data << "\t";
            }
            cout << "\n";
         }

        cout << "----------------------------------" << "\n";
        q.erase(q.begin());
    }

    cout << "Final Array: " << "\n";
    for(int j = 0; j < N; j++) {
        for(int k = 0; k < M; k++) {
            cout << arr[j][k].data << "\t";
        }
        cout << "\n";
     }

}



inline void scanint(int &x) {
    register int c = getchar_unlocked();
    x = 0;
    int neg = 0;

    for(; ((c<48 || c>57) && c != '-'); c = getchar_unlocked());

    if(c=='-') {
        neg = 1;
        c = getchar_unlocked();
    }

    for(; c>47 && c<58 ; c = getchar_unlocked()) {
        x = (x<<1) + (x<<3) + c - 48;
    }

    if(neg)
        x = -x;
}

int main() {

	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;

    scanint(t);

    for(int i = 0; i < t; i++) {

		int N, M;

		scanint(N);
		scanint(M);

		node** arr = new node*[N];
		for(int j = 0; j < N; j++) {
			arr[j] = new node[M];
		}

        // for(int j = 0; j < N; j++) {
        //     for(int k = 0; k < M; k++) {
        //         arr[j][k] = 1;
        //     }
        // }

		diff_neighbours(arr, N, M);
	}



	return 0;
}
