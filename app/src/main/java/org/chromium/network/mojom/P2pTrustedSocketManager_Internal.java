
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/p2p_trusted.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class P2pTrustedSocketManager_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<P2pTrustedSocketManager, P2pTrustedSocketManager.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<P2pTrustedSocketManager, P2pTrustedSocketManager.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.P2PTrustedSocketManager";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, P2pTrustedSocketManager impl) {
            return new Stub(core, impl);
        }

        @Override
        public P2pTrustedSocketManager[] buildArray(int size) {
          return new P2pTrustedSocketManager[size];
        }
    };


    private static final int START_RTP_DUMP_ORDINAL = 0;

    private static final int STOP_RTP_DUMP_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements P2pTrustedSocketManager.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void startRtpDump(
boolean incoming, boolean outgoing) {

            P2pTrustedSocketManagerStartRtpDumpParams _message = new P2pTrustedSocketManagerStartRtpDumpParams();

            _message.incoming = incoming;

            _message.outgoing = outgoing;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(START_RTP_DUMP_ORDINAL)));

        }


        @Override
        public void stopRtpDump(
boolean incoming, boolean outgoing) {

            P2pTrustedSocketManagerStopRtpDumpParams _message = new P2pTrustedSocketManagerStopRtpDumpParams();

            _message.incoming = incoming;

            _message.outgoing = outgoing;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(STOP_RTP_DUMP_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<P2pTrustedSocketManager> {

        Stub(org.chromium.mojo.system.Core core, P2pTrustedSocketManager impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                P2pTrustedSocketManager_Internal.MANAGER, messageWithHeader);





                    case START_RTP_DUMP_ORDINAL: {

                        P2pTrustedSocketManagerStartRtpDumpParams data =
                                P2pTrustedSocketManagerStartRtpDumpParams.deserialize(messageWithHeader.getPayload());

                        getImpl().startRtpDump(data.incoming, data.outgoing);
                        return true;
                    }





                    case STOP_RTP_DUMP_ORDINAL: {

                        P2pTrustedSocketManagerStopRtpDumpParams data =
                                P2pTrustedSocketManagerStopRtpDumpParams.deserialize(messageWithHeader.getPayload());

                        getImpl().stopRtpDump(data.incoming, data.outgoing);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), P2pTrustedSocketManager_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class P2pTrustedSocketManagerStartRtpDumpParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean incoming;
        public boolean outgoing;

        private P2pTrustedSocketManagerStartRtpDumpParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public P2pTrustedSocketManagerStartRtpDumpParams() {
            this(0);
        }

        public static P2pTrustedSocketManagerStartRtpDumpParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static P2pTrustedSocketManagerStartRtpDumpParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static P2pTrustedSocketManagerStartRtpDumpParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            P2pTrustedSocketManagerStartRtpDumpParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new P2pTrustedSocketManagerStartRtpDumpParams(elementsOrVersion);
                    {
                        
                    result.incoming = decoder0.readBoolean(8, 0);
                    }
                    {
                        
                    result.outgoing = decoder0.readBoolean(8, 1);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.incoming, 8, 0);
            
            encoder0.encode(this.outgoing, 8, 1);
        }
    }



    
    static final class P2pTrustedSocketManagerStopRtpDumpParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean incoming;
        public boolean outgoing;

        private P2pTrustedSocketManagerStopRtpDumpParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public P2pTrustedSocketManagerStopRtpDumpParams() {
            this(0);
        }

        public static P2pTrustedSocketManagerStopRtpDumpParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static P2pTrustedSocketManagerStopRtpDumpParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static P2pTrustedSocketManagerStopRtpDumpParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            P2pTrustedSocketManagerStopRtpDumpParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new P2pTrustedSocketManagerStopRtpDumpParams(elementsOrVersion);
                    {
                        
                    result.incoming = decoder0.readBoolean(8, 0);
                    }
                    {
                        
                    result.outgoing = decoder0.readBoolean(8, 1);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.incoming, 8, 0);
            
            encoder0.encode(this.outgoing, 8, 1);
        }
    }



}
