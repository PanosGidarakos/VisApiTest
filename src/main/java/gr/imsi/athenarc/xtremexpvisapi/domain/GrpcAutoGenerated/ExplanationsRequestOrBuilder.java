// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xai_service.proto

package gr.imsi.athenarc.xtremexpvisapi.domain.GrpcAutoGenerated;

public interface ExplanationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ExplanationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string explanation_type = 1;</code>
   */
  java.lang.String getExplanationType();
  /**
   * <code>string explanation_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getExplanationTypeBytes();

  /**
   * <code>string explanation_method = 2;</code>
   */
  java.lang.String getExplanationMethod();
  /**
   * <code>string explanation_method = 2;</code>
   */
  com.google.protobuf.ByteString
      getExplanationMethodBytes();

  /**
   * <code>string model = 3;</code>
   */
  java.lang.String getModel();
  /**
   * <code>string model = 3;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <code>string feature1 = 4;</code>
   */
  java.lang.String getFeature1();
  /**
   * <code>string feature1 = 4;</code>
   */
  com.google.protobuf.ByteString
      getFeature1Bytes();

  /**
   * <code>string feature2 = 5;</code>
   */
  java.lang.String getFeature2();
  /**
   * <code>string feature2 = 5;</code>
   */
  com.google.protobuf.ByteString
      getFeature2Bytes();

  /**
   * <code>int32 num_influential = 6;</code>
   */
  int getNumInfluential();

  /**
   * <pre>
   * ----- Counterfactual Explanation Fields -----
   * </pre>
   *
   * <code>bytes proxy_dataset = 7;</code>
   */
  com.google.protobuf.ByteString getProxyDataset();

  /**
   * <code>bytes query = 8;</code>
   */
  com.google.protobuf.ByteString getQuery();

  /**
   * <pre>
   * ------------ PDP Fields -------------------------
   * the other same as Pipeline Explainability plus
   * </pre>
   *
   * <code>string features = 9;</code>
   */
  java.lang.String getFeatures();
  /**
   * <pre>
   * ------------ PDP Fields -------------------------
   * the other same as Pipeline Explainability plus
   * </pre>
   *
   * <code>string features = 9;</code>
   */
  com.google.protobuf.ByteString
      getFeaturesBytes();

  /**
   * <pre>
   * ------------ CounterfactualExplanations Fields -------------------------
   * same as Model explainability plus target target label 
   * </pre>
   *
   * <code>string target = 10;</code>
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * ------------ CounterfactualExplanations Fields -------------------------
   * same as Model explainability plus target target label 
   * </pre>
   *
   * <code>string target = 10;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes();
}
