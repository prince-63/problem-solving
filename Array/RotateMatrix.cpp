#include <vector>

void rotateMatrix(vector<vector<int>> &mat)
{

    // brute force oproch O(n2)
    // int n = mat.size();
    // int temp[n][n] = {0};

    // reverse(mat.begin(), mat.end());

    // for(int i = 0; i < n; i++)
    // {
    // 	for(int j = 0; j < n; j++)
    // 	{
    // 		temp[i][j] = mat[j][i];
    // 	}
    // }

    // for(int i = 0; i < n; i++)
    // {
    // 	for(int j = 0; j < n; j++)
    // 	{
    // 		mat[i][j] = temp[i][j];
    // 	}
    // }

    int n = mat.size();
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            swap(mat[i][j], mat[j][i]);
        }
        reverse(mat[i].begin(), mat[i].end());
    }
}