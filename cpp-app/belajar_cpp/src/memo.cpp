#include "header.h"

void HelloHeader::Memo(){
    //declare point int
    int *pointInt;

    //declare point float
    float *pointFloat;

    //dynamic allocate memory
    pointInt = new int;
    pointFloat = new float;

    *pointInt = 45;
    *pointFloat = 45.45f;

    std::cout<<*pointInt<< "\n addres : "<<&pointInt<<std::endl;
    std::cout<<*pointFloat<< "\n addres : "<<&pointFloat<<std::endl;

    //deallocate the memory
    delete pointInt;
    delete pointFloat;
}