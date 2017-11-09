#include <jni.h>
#include <stdio.h>

jint
Java_com_telestronix_nativecalculator_MainActivity_addNum(JNIEnv* env, jobject this, jint a, jint b){
    return addNum(a,b);
}

int addNum(int a, int b){
    return a + b;
}

Java_com_telestronix_nativecalculator_MainActivity_subNum(JNIEnv* env, jobject this, jint num1, jint num2){
    return subNum(num1,num2);
}
int subNum(int num1, int num2){
    return num1 - num2;
}

