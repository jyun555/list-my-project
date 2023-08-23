#include "header.h"

int main(){
    HelloHeader hh;
    // hh.Memo();
    int fval, sval;
    int *sugan;

    sugan = &fval;
    *sugan = 20;

    std::cout<<&fval;

    return 0;
}
