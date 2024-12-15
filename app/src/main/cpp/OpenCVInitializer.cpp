#include <jni.h>
#include <string>
#include <opencv2/core.hpp>
#include <jni.h>

extern "C" JNIEXPORT jboolean  extern "C" JNICALL
Java_com_example_app_MainActivity_initializeOpenCV(JNIEnv *env, jobject /* this */) {
    try {
        // Check if OpenCV is properly linked
        cv::Mat testMat = cv::Mat::eye(3, 3, CV_8UC1);
        return (testMat.rows == 3 && testMat.cols == 3) ? JNI_TRUE : JNI_FALSE;
    } catch (const std::exception &e) {
        return JNI_FALSE;
    }
}