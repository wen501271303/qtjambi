#ifndef QDYNAMICMETAOBJECT_H
#define QDYNAMICMETAOBJECT_H

#include "qtjambi_global.h"

#include <QtCore/QByteArray>
#include <QtCore/QMetaObject>

#include <jni.h>

class QTJAMBI_EXPORT QDynamicMetaObject: public QMetaObject
{
public:
    QDynamicMetaObject(JNIEnv *jni_env, jclass java_class, const QMetaObject *original_meta_object, jobject object);
    virtual ~QDynamicMetaObject();

    int invokeSignalOrSlot(JNIEnv *env, jobject object, int _id, void **_a) const;
    int readProperty(JNIEnv *env, jobject object, int _id, void **_a) const;
    int writeProperty(JNIEnv *env, jobject object, int _id, void **_a) const;
    int resetProperty(JNIEnv *env, jobject object, int _id, void **_a) const;

private:
    void initialize(JNIEnv *jni_env, jclass java_class, const QMetaObject *original_meta_object, jobject object);
    void invokeMethod(JNIEnv *env, jobject object, jobject method_object, void **_a) const;

    int m_method_count;
    int m_signal_count;
    int m_property_count;

    jobjectArray m_methods;
    jobjectArray m_signals;

    jobjectArray m_property_readers;
    jobjectArray m_property_writers;
    jobjectArray m_property_resetters;
};

#endif // QDYNAMICMETAOBJECT_H