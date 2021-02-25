#include <iostream>
using namespace std;

const int NMAX = 618;

struct Edge {
    int x, y;
    Edge(int x, int y) {
        this->x = x;
        this->y = y;
    }
};

int n; // Nodes
bool ad[NMAX][NMAX];

bool find(Edge edge) {
        return ad[edge.x][edge.y];
}
void neighbors(int node) {
    cout<<"\x1b[32mNode "<<node<<": \x1b[0m";
    for (int j = 1; j <= n; j++)
        if (ad[node][j])
            cout << j << ' ';
    cout << '\n';
}

int main() {
    auto remove = [](Edge edge) -> void {
        ad[edge.x][edge.y] = ad[edge.y][edge.x] = false;
    };
    auto insert= [](Edge edge) -> void {
        ad[edge.x][edge.y] = ad[edge.y][edge.x] = true;
    };
    
    n = 5;
    insert(Edge(1, 2));
    insert(Edge(1, 3));
    insert(Edge(1, 4));
    insert(Edge(4, 5));

    insert(Edge(3, 4));
    remove(Edge(3, 4));

    cout<<"\x1b[34m"<<find(Edge(4, 5)) << endl;
    cout<<find(Edge(2, 5)) <<"\x1b[0m"<<endl;

    neighbors(1);
    neighbors(2);
    neighbors(3);
    neighbors(4);
    neighbors(5);
    return 0;
}
