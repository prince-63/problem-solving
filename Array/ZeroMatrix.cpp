#include <bits/stdc++.h>
using namespace std;

// 1. brute force solution
// // set row -1
// void setRow(vector<vector<int>> &matrix, int n, int m, int i) {
// 	for(int j = 0; j < m; j++) {
// 		if(matrix[i][j] != 0) {
// 			matrix[i][j] = -1;
// 		}
// 	}
// }

// // set col -1
// void setCol(vector<vector<int>> &matrix, int n, int m, int j) {
// 	for(int i = 0; i < n; i++) {
// 		if(matrix[i][j] != 0) {
// 			matrix[i][j] = -1;
// 		}
// 	}
// }

// vector<vector<int>> zeroMatrix(vector<vector<int>> &matrix, int n, int m) {
// 	for(int i = 0; i < n; i++) {
// 		for(int j = 0; j < m; j++) {
// 			if(matrix[i][j] == 0) {
// 				setRow(matrix, n, m, i);
// 				setCol(matrix, n, m, j);
// 			}
// 		}
// 	}

// 	for(int i = 0; i < n; i++) {
// 		for(int j = 0; j < m; j++) {
// 			if(matrix[i][j] == -1) {
// 				matrix[i][j] = 0;
// 			}
// 		}
// 	}

// 	return matrix;
// }

vector<vector<int>> zeroMatrix(vector<vector<int>> &matrix, int n, int m)
{
    int rowSet[n] = {0};
    int colSet[m] = {0};

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (matrix[i][j] == 0)
            {
                colSet[j] = 1;
                rowSet[i] = 1;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (colSet[j] || rowSet[i])
            {
                matrix[i][j] = 0;
            }
        }
    }

    return matrix;
}