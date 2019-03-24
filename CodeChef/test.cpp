#include<iostream>
#include <bits/stdc++.h>
using namespace std;

class Hello {

public:
  void display() {
    cout << "HELLO\n";
  }
};

int main() {

    Hello *h = new Hello();

    h->display();

    return 0;
}
