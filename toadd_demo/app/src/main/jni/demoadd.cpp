//
// Created by 白明君 on 2019/12/8.
//

#include "com_test_jnidemo_toadd.h"

JNIEXPORT jint JNICALL Java_com_test_jnidemo_toadd_add
    (JNIEnv *env,jobject obj,jint i,jint j){
        return i + j;
}
