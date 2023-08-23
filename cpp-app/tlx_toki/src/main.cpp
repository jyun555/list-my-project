#include <iostream>
#include <chrono>

int main(){
    std::time_t now = time(0);
    tm *ltm = localtime(&now);
    int years;
    std::cout<<"Enter Your Year of Birth : ";
    std::cin>>years;
    int rslt = 1900 + ltm->tm_year - years;
    std::cout<<"Your Age : "<<rslt<<"\n";
    return 0;
}