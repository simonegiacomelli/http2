
package sks.samples.http2.netty.common;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http2.Http2Connection;
import io.netty.handler.codec.http2.Http2ConnectionEncoder;
import io.netty.handler.codec.http2.Http2EventAdapter;
import io.netty.handler.codec.http2.Http2FrameAdapter;

public class FrameListener extends Http2EventAdapter {

    private Http2ConnectionEncoder encoder;
    private Http2Connection connection;
    private ChannelHandlerContext channelHandlerContext;

    public void setEncoder(Http2ConnectionEncoder encoder) {
        this.encoder = encoder;
    }

    public void setConnection(Http2Connection connection) {
        this.connection = connection;
    }

    public void setChannelHandlerContext(ChannelHandlerContext channelHandlerContext) {
        this.channelHandlerContext = channelHandlerContext;
    }

    public Http2ConnectionEncoder getEncoder() {
        return encoder;
    }

    public Http2Connection getConnection() {
        return connection;
    }

    public ChannelHandlerContext getChannelHandlerContext() {
        return channelHandlerContext;
    }
}