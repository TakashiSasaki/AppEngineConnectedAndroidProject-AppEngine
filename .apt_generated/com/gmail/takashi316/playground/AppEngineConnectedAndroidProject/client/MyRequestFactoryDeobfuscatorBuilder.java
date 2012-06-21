// Automatically Generated -- DO NOT EDIT
// com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.client.MyRequestFactory
package com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.client;
import java.util.Arrays;
import com.google.web.bindery.requestfactory.vm.impl.OperationData;
import com.google.web.bindery.requestfactory.vm.impl.OperationKey;
public final class MyRequestFactoryDeobfuscatorBuilder extends com.google.web.bindery.requestfactory.vm.impl.Deobfuscator.Builder {
{
withOperation(new OperationKey("0vEdzshTN_oNbFcISEhwAjciHs4="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()Ljava/lang/String;")
  .withMethodName("send")
  .withRequestContext("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.client.MyRequestFactory$MessageRequest")
  .build());
withOperation(new OperationKey("Qo1SL80nXXzeFLdQp38e72Jk9Po="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("()Ljava/lang/String;")
  .withMethodName("getMessage")
  .withRequestContext("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.client.MyRequestFactory$HelloWorldRequest")
  .build());
withOperation(new OperationKey("UOLxwO0HYZXZoVVL1PySLPY3Mhk="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()V")
  .withMethodName("register")
  .withRequestContext("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.client.MyRequestFactory$RegistrationInfoRequest")
  .build());
withOperation(new OperationKey("zTksSfSglRs3itzC6vB7t8j5Rco="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()V")
  .withMethodName("unregister")
  .withRequestContext("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.client.MyRequestFactory$RegistrationInfoRequest")
  .build());
withRawTypeToken("adaSYmTTJXydZhHrH5Wf2ErkS68=", "com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.shared.MessageProxy");
withRawTypeToken("p95$M_XiUaTQ385fRJjA_AnIUMw=", "com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.shared.RegistrationInfoProxy");
withRawTypeToken("8KVVbwaaAtl6KgQNlOTsLCp9TIU=", "com.google.web.bindery.requestfactory.shared.ValueProxy");
withRawTypeToken("FXHD5YU0TiUl3uBaepdkYaowx9k=", "com.google.web.bindery.requestfactory.shared.BaseProxy");
withClientToDomainMappings("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.server.Message", Arrays.asList("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.shared.MessageProxy"));
withClientToDomainMappings("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.server.RegistrationInfo", Arrays.asList("com.gmail.takashi316.playground.AppEngineConnectedAndroidProject.shared.RegistrationInfoProxy"));
}}
