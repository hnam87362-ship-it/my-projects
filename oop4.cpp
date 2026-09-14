#include <iostream>
using namespace std;

class Rectangle
{
private:
    int x = 0;
    int y = 0;

public:
    Rectangle()
    {
        cout << "enter width of rectangle: ";
        cin >> x;
        cout << "enter hight of rectangle: ";
        cin >> y;
    }
    
    int arearect()
    {
        int area = 0;
        area = x * y;
        return area;
    }
    
    friend void find(Rectangle ob1, Rectangle ob2);
};

void find(Rectangle ob1, Rectangle ob2)
{
    cout << "welcome to rectangle program\n";
    if(ob1.arearect() > ob2.arearect())
    {
        cout << "area of rectangle 1 is greater than area of rectangle 2";
    }
    else if(ob1.arearect() < ob2.arearect())
    {
        cout << "area of rectangle 2 is greater than area of rectangle 1";
    }
    else 
    {
        cout << "area of rectangle 1 is equal to area of rectangle 2";
    }
}

int main()
{
    Rectangle ob1, ob2;
    find(ob1, ob2);
    return 0;
}