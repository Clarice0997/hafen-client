/*
 *  This file is part of the Haven & Hearth game client.
 *  Copyright (C) 2009 Fredrik Tolf <fredrik@dolda2000.com>, and
 *                     Björn Johannessen <johannessen.bjorn@gmail.com>
 *
 *  Redistribution and/or modification of this file is subject to the
 *  terms of the GNU Lesser General Public License, version 3, as
 *  published by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  Other parts of this source tree adhere to other copying
 *  rights. Please see the file `COPYING' in the root directory of the
 *  source tree for details.
 *
 *  A copy the GNU Lesser General Public License is distributed along
 *  with the source tree of which this file is a part in the file
 *  `doc/LPGL-3'. If it is missing for any reason, please see the Free
 *  Software Foundation's website at <http://www.fsf.org/>, or write
 *  to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 *  Boston, MA 02111-1307 USA
 */

package haven.render.gl;

import java.nio.*;

public interface GL {
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = com.jogamp.opengl.GL3.GL_ALIASED_LINE_WIDTH_RANGE;
    public static final int GL_ARRAY_BUFFER = com.jogamp.opengl.GL3.GL_ARRAY_BUFFER;
    public static final int GL_BACK = com.jogamp.opengl.GL.GL_BACK;
    public static final int GL_BLEND = com.jogamp.opengl.GL.GL_BLEND;
    public static final int GL_BUFFER = com.jogamp.opengl.GL3.GL_BUFFER;
    public static final int GL_COLOR_ATTACHMENT0 = com.jogamp.opengl.GL.GL_COLOR_ATTACHMENT0;
    public static final int GL_COLOR_BUFFER_BIT = com.jogamp.opengl.GL3.GL_COLOR_BUFFER_BIT;
    public static final int GL_COMPILE_STATUS = com.jogamp.opengl.GL3.GL_COMPILE_STATUS;
    public static final int GL_CONSTANT_ALPHA = com.jogamp.opengl.GL3.GL_CONSTANT_ALPHA;
    public static final int GL_CONSTANT_COLOR = com.jogamp.opengl.GL3.GL_CONSTANT_COLOR;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = com.jogamp.opengl.GL3.GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH;
    public static final int GL_DEBUG_OUTPUT = com.jogamp.opengl.GL3.GL_DEBUG_OUTPUT;
    public static final int GL_DEPTH_ATTACHMENT = com.jogamp.opengl.GL.GL_DEPTH_ATTACHMENT;
    public static final int GL_DEPTH_BUFFER_BIT = com.jogamp.opengl.GL3.GL_DEPTH_BUFFER_BIT;
    public static final int GL_DST_ALPHA = com.jogamp.opengl.GL.GL_DST_ALPHA;
    public static final int GL_DST_COLOR = com.jogamp.opengl.GL.GL_DST_COLOR;
    public static final int GL_DYNAMIC_DRAW = com.jogamp.opengl.GL3.GL_DYNAMIC_DRAW;
    public static final int GL_ELEMENT_ARRAY_BUFFER = com.jogamp.opengl.GL3.GL_ELEMENT_ARRAY_BUFFER;
    public static final int GL_EXTENSIONS = com.jogamp.opengl.GL3.GL_EXTENSIONS;
    public static final int GL_FRAGMENT_SHADER = com.jogamp.opengl.GL3.GL_FRAGMENT_SHADER;
    public static final int GL_FRAMEBUFFER = com.jogamp.opengl.GL.GL_FRAMEBUFFER;
    public static final int GL_FRAMEBUFFER_COMPLETE = com.jogamp.opengl.GL.GL_FRAMEBUFFER_COMPLETE;
    public static final int GL_FUNC_ADD = com.jogamp.opengl.GL.GL_FUNC_ADD;
    public static final int GL_FUNC_REVERSE_SUBTRACT = com.jogamp.opengl.GL.GL_FUNC_REVERSE_SUBTRACT;
    public static final int GL_FUNC_SUBTRACT = com.jogamp.opengl.GL.GL_FUNC_SUBTRACT;
    public static final int GL_INFO_LOG_LENGTH = com.jogamp.opengl.GL3.GL_INFO_LOG_LENGTH;
    public static final int GL_INVALID_ENUM = com.jogamp.opengl.GL.GL_INVALID_ENUM;
    public static final int GL_INVALID_VALUE = com.jogamp.opengl.GL.GL_INVALID_VALUE;
    public static final int GL_INVALID_OPERATION = com.jogamp.opengl.GL.GL_INVALID_OPERATION;
    public static final int GL_LINK_STATUS = com.jogamp.opengl.GL3.GL_LINK_STATUS;
    public static final int GL_MAJOR_VERSION = com.jogamp.opengl.GL3.GL_MAJOR_VERSION;
    public static final int GL_MAX = com.jogamp.opengl.GL3.GL_MAX;
    public static final int GL_MAX_COLOR_ATTACHMENTS = com.jogamp.opengl.GL3.GL_MAX_COLOR_ATTACHMENTS;
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = com.jogamp.opengl.GL3.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT;
    public static final int GL_MIN = com.jogamp.opengl.GL3.GL_MIN;
    public static final int GL_MINOR_VERSION = com.jogamp.opengl.GL3.GL_MINOR_VERSION;
    public static final int GL_NONE = com.jogamp.opengl.GL.GL_NONE;
    public static final int GL_ONE = com.jogamp.opengl.GL.GL_ONE;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = com.jogamp.opengl.GL3.GL_ONE_MINUS_CONSTANT_ALPHA;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = com.jogamp.opengl.GL3.GL_ONE_MINUS_CONSTANT_COLOR;
    public static final int GL_ONE_MINUS_DST_ALPHA = com.jogamp.opengl.GL.GL_ONE_MINUS_DST_ALPHA;
    public static final int GL_ONE_MINUS_DST_COLOR = com.jogamp.opengl.GL.GL_ONE_MINUS_DST_COLOR;
    public static final int GL_ONE_MINUS_SRC_ALPHA = com.jogamp.opengl.GL.GL_ONE_MINUS_SRC_ALPHA;
    public static final int GL_ONE_MINUS_SRC_COLOR = com.jogamp.opengl.GL.GL_ONE_MINUS_SRC_COLOR;
    public static final int GL_OUT_OF_MEMORY = com.jogamp.opengl.GL.GL_OUT_OF_MEMORY;
    public static final int GL_PACK_ALIGNMENT = com.jogamp.opengl.GL3.GL_PACK_ALIGNMENT;
    public static final int GL_PIXEL_PACK_BUFFER = com.jogamp.opengl.GL3.GL_PIXEL_PACK_BUFFER;
    public static final int GL_PROGRAM_POINT_SIZE = com.jogamp.opengl.GL3.GL_PROGRAM_POINT_SIZE;
    public static final int GL_QUERY_RESULT = com.jogamp.opengl.GL3.GL_QUERY_RESULT;
    public static final int GL_QUERY_RESULT_AVAILABLE = com.jogamp.opengl.GL3.GL_QUERY_RESULT_AVAILABLE;
    public static final int GL_RENDERER = com.jogamp.opengl.GL3.GL_RENDERER;
    public static final int GL_SHADING_LANGUAGE_VERSION = com.jogamp.opengl.GL3.GL_SHADING_LANGUAGE_VERSION;
    public static final int GL_SIGNALED = com.jogamp.opengl.GL3.GL_SIGNALED;
    public static final int GL_SRC_ALPHA = com.jogamp.opengl.GL.GL_SRC_ALPHA;
    public static final int GL_SRC_COLOR = com.jogamp.opengl.GL.GL_SRC_COLOR;
    public static final int GL_STATIC_DRAW = com.jogamp.opengl.GL3.GL_STATIC_DRAW;
    public static final int GL_STREAM_DRAW = com.jogamp.opengl.GL3.GL_STREAM_DRAW;
    public static final int GL_STREAM_READ = com.jogamp.opengl.GL3.GL_STREAM_READ;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = com.jogamp.opengl.GL3.GL_SYNC_GPU_COMMANDS_COMPLETE;
    public static final int GL_SYNC_STATUS = com.jogamp.opengl.GL3.GL_SYNC_STATUS;
    public static final int GL_TEXTURE = com.jogamp.opengl.GL3.GL_TEXTURE;
    public static final int GL_TEXTURE0 = com.jogamp.opengl.GL.GL_TEXTURE0;
    public static final int GL_TEXTURE_1D = com.jogamp.opengl.GL3.GL_TEXTURE_1D;
    public static final int GL_TEXTURE_1D_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_1D_ARRAY;
    public static final int GL_TEXTURE_2D = com.jogamp.opengl.GL.GL_TEXTURE_2D;
    public static final int GL_TEXTURE_2D_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_2D_ARRAY;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = com.jogamp.opengl.GL3.GL_TEXTURE_2D_MULTISAMPLE;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_2D_MULTISAMPLE_ARRAY;
    public static final int GL_TEXTURE_3D = com.jogamp.opengl.GL3.GL_TEXTURE_3D;
    public static final int GL_TEXTURE_BORDER_COLOR = com.jogamp.opengl.GL3.GL_TEXTURE_BORDER_COLOR;
    public static final int GL_TEXTURE_CUBE_MAP = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_ARRAY;
    public static final int GL_TEXTURE_MIN_FILTER = com.jogamp.opengl.GL3.GL_TEXTURE_MIN_FILTER;
    public static final int GL_TEXTURE_MAG_FILTER = com.jogamp.opengl.GL3.GL_TEXTURE_MAG_FILTER;
    public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = com.jogamp.opengl.GL3.GL_TEXTURE_MAX_ANISOTROPY_EXT;
    public static final int GL_TEXTURE_WRAP_S = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_S;
    public static final int GL_TEXTURE_WRAP_T = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_T;
    public static final int GL_TEXTURE_WRAP_R = com.jogamp.opengl.GL3.GL_TEXTURE_WRAP_R;
    public static final int GL_TIMESTAMP = com.jogamp.opengl.GL3.GL_TIMESTAMP;
    public static final int GL_VENDOR = com.jogamp.opengl.GL3.GL_VENDOR;
    public static final int GL_VERSION = com.jogamp.opengl.GL3.GL_VERSION;
    public static final int GL_VERTEX_ARRAY = com.jogamp.opengl.GL2.GL_VERTEX_ARRAY;
    public static final int GL_VERTEX_SHADER = com.jogamp.opengl.GL3.GL_VERTEX_SHADER;
    public static final int GL_ZERO = com.jogamp.opengl.GL.GL_ZERO;
    public static final int GL_NEAREST = com.jogamp.opengl.GL.GL_NEAREST;
    public static final int GL_LINEAR = com.jogamp.opengl.GL.GL_LINEAR;
    public static final int GL_NEAREST_MIPMAP_NEAREST = com.jogamp.opengl.GL.GL_NEAREST_MIPMAP_NEAREST;
    public static final int GL_NEAREST_MIPMAP_LINEAR = com.jogamp.opengl.GL.GL_NEAREST_MIPMAP_LINEAR;
    public static final int GL_LINEAR_MIPMAP_NEAREST = com.jogamp.opengl.GL.GL_LINEAR_MIPMAP_NEAREST;
    public static final int GL_LINEAR_MIPMAP_LINEAR = com.jogamp.opengl.GL.GL_LINEAR_MIPMAP_LINEAR;
    public static final int GL_REPEAT = com.jogamp.opengl.GL.GL_REPEAT;
    public static final int GL_MIRRORED_REPEAT = com.jogamp.opengl.GL.GL_MIRRORED_REPEAT;
    public static final int GL_CLAMP_TO_EDGE = com.jogamp.opengl.GL.GL_CLAMP_TO_EDGE;
    public static final int GL_CLAMP_TO_BORDER = com.jogamp.opengl.GL3.GL_CLAMP_TO_BORDER;
    public static final int GL_R8 = com.jogamp.opengl.GL3.GL_R8;
    public static final int GL_R8_SNORM = com.jogamp.opengl.GL3.GL_R8_SNORM;
    public static final int GL_R16 = com.jogamp.opengl.GL3.GL_R16;
    public static final int GL_R16_SNORM = com.jogamp.opengl.GL3.GL_R16_SNORM;
    public static final int GL_R16F = com.jogamp.opengl.GL3.GL_R16F;
    public static final int GL_R8I = com.jogamp.opengl.GL3.GL_R8I;
    public static final int GL_R8UI = com.jogamp.opengl.GL3.GL_R8UI;
    public static final int GL_R16I = com.jogamp.opengl.GL3.GL_R16I;
    public static final int GL_R16UI = com.jogamp.opengl.GL3.GL_R16UI;
    public static final int GL_R32I = com.jogamp.opengl.GL3.GL_R32I;
    public static final int GL_R32UI = com.jogamp.opengl.GL3.GL_R32UI;
    public static final int GL_DEPTH_COMPONENT = com.jogamp.opengl.GL3.GL_DEPTH_COMPONENT;
    public static final int GL_RG8 = com.jogamp.opengl.GL3.GL_RG8;
    public static final int GL_RG8_SNORM = com.jogamp.opengl.GL3.GL_RG8_SNORM;
    public static final int GL_RG16 = com.jogamp.opengl.GL3.GL_RG16;
    public static final int GL_RG16_SNORM = com.jogamp.opengl.GL3.GL_RG16_SNORM;
    public static final int GL_RG8I = com.jogamp.opengl.GL3.GL_RG8I;
    public static final int GL_RG8UI = com.jogamp.opengl.GL3.GL_RG8UI;
    public static final int GL_RG16I = com.jogamp.opengl.GL3.GL_RG16I;
    public static final int GL_RG16UI = com.jogamp.opengl.GL3.GL_RG16UI;
    public static final int GL_RG16F = com.jogamp.opengl.GL3.GL_RG16F;
    public static final int GL_RG32I = com.jogamp.opengl.GL3.GL_RG32I;
    public static final int GL_RG32UI = com.jogamp.opengl.GL3.GL_RG32UI;
    public static final int GL_RGB8 = com.jogamp.opengl.GL3.GL_RGB8;
    public static final int GL_RGB8_SNORM = com.jogamp.opengl.GL3.GL_RGB8_SNORM;
    public static final int GL_RGB16 = com.jogamp.opengl.GL3.GL_RGB16;
    public static final int GL_RGB16_SNORM = com.jogamp.opengl.GL3.GL_RGB16_SNORM;
    public static final int GL_RGB8I = com.jogamp.opengl.GL3.GL_RGB8I;
    public static final int GL_RGB8UI = com.jogamp.opengl.GL3.GL_RGB8UI;
    public static final int GL_RGB16I = com.jogamp.opengl.GL3.GL_RGB16I;
    public static final int GL_RGB16UI = com.jogamp.opengl.GL3.GL_RGB16UI;
    public static final int GL_RGB32I = com.jogamp.opengl.GL3.GL_RGB32I;
    public static final int GL_RGB32UI = com.jogamp.opengl.GL3.GL_RGB32UI;
    public static final int GL_RGB16F = com.jogamp.opengl.GL3.GL_RGB16F;
    public static final int GL_RGBA8 = com.jogamp.opengl.GL3.GL_RGBA8;
    public static final int GL_RGBA8_SNORM = com.jogamp.opengl.GL3.GL_RGBA8_SNORM;
    public static final int GL_RGBA16 = com.jogamp.opengl.GL3.GL_RGBA16;
    public static final int GL_RGBA16_SNORM = com.jogamp.opengl.GL3.GL_RGBA16_SNORM;
    public static final int GL_RGBA8I = com.jogamp.opengl.GL3.GL_RGBA8I;
    public static final int GL_RGBA8UI = com.jogamp.opengl.GL3.GL_RGBA8UI;
    public static final int GL_RGBA16I = com.jogamp.opengl.GL3.GL_RGBA16I;
    public static final int GL_RGBA16UI = com.jogamp.opengl.GL3.GL_RGBA16UI;
    public static final int GL_RGBA32I = com.jogamp.opengl.GL3.GL_RGBA32I;
    public static final int GL_RGBA32UI = com.jogamp.opengl.GL3.GL_RGBA32UI;
    public static final int GL_RGBA16F = com.jogamp.opengl.GL3.GL_RGBA16F;
    public static final int GL_SRGB8 = com.jogamp.opengl.GL3.GL_SRGB8;
    public static final int GL_SRGB8_ALPHA8 = com.jogamp.opengl.GL3.GL_SRGB8_ALPHA8;
    public static final int GL_RED = com.jogamp.opengl.GL3.GL_RED;
    public static final int GL_RG = com.jogamp.opengl.GL3.GL_RG;
    public static final int GL_RGB = com.jogamp.opengl.GL3.GL_RGB;
    public static final int GL_RGBA = com.jogamp.opengl.GL3.GL_RGBA;
    public static final int GL_RED_INTEGER = com.jogamp.opengl.GL3.GL_RED_INTEGER;
    public static final int GL_RG_INTEGER = com.jogamp.opengl.GL3.GL_RG_INTEGER;
    public static final int GL_RGB_INTEGER = com.jogamp.opengl.GL3.GL_RGB_INTEGER;
    public static final int GL_RGBA_INTEGER = com.jogamp.opengl.GL3.GL_RGBA_INTEGER;
    public static final int GL_BGR = com.jogamp.opengl.GL3.GL_BGR;
    public static final int GL_BGRA = com.jogamp.opengl.GL3.GL_BGRA;
    public static final int GL_BYTE = com.jogamp.opengl.GL3.GL_BYTE;
    public static final int GL_SHORT = com.jogamp.opengl.GL3.GL_SHORT;
    public static final int GL_INT = com.jogamp.opengl.GL3.GL_INT;
    public static final int GL_UNSIGNED_BYTE = com.jogamp.opengl.GL3.GL_UNSIGNED_BYTE;
    public static final int GL_UNSIGNED_SHORT = com.jogamp.opengl.GL3.GL_UNSIGNED_SHORT;
    public static final int GL_UNSIGNED_INT = com.jogamp.opengl.GL3.GL_UNSIGNED_INT;
    public static final int GL_FLOAT = com.jogamp.opengl.GL3.GL_FLOAT;
    public static final int GL_HALF_FLOAT = com.jogamp.opengl.GL3.GL_HALF_FLOAT;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_X;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_Y;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_POSITIVE_Z;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_X;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = com.jogamp.opengl.GL3.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;
    public static final int GL_SCISSOR_TEST = com.jogamp.opengl.GL3.GL_SCISSOR_TEST;
    public static final int GL_FRONT = com.jogamp.opengl.GL3.GL_FRONT;
    public static final int GL_FRONT_AND_BACK = com.jogamp.opengl.GL3.GL_FRONT_AND_BACK;
    public static final int GL_CULL_FACE = com.jogamp.opengl.GL3.GL_CULL_FACE;
    public static final int GL_NEVER = com.jogamp.opengl.GL3.GL_NEVER;
    public static final int GL_ALWAYS = com.jogamp.opengl.GL3.GL_ALWAYS;
    public static final int GL_EQUAL = com.jogamp.opengl.GL3.GL_EQUAL;
    public static final int GL_NOTEQUAL = com.jogamp.opengl.GL3.GL_NOTEQUAL;
    public static final int GL_LESS = com.jogamp.opengl.GL3.GL_LESS;
    public static final int GL_LEQUAL = com.jogamp.opengl.GL3.GL_LEQUAL;
    public static final int GL_GREATER = com.jogamp.opengl.GL3.GL_GREATER;
    public static final int GL_GEQUAL = com.jogamp.opengl.GL3.GL_GEQUAL;
    public static final int GL_DEPTH_TEST = com.jogamp.opengl.GL3.GL_DEPTH_TEST;
    public static final int GL_POLYGON_OFFSET_FILL = com.jogamp.opengl.GL3.GL_POLYGON_OFFSET_FILL;
    public static final int GL_POINTS = com.jogamp.opengl.GL3.GL_POINTS;
    public static final int GL_LINES = com.jogamp.opengl.GL3.GL_LINES;
    public static final int GL_LINE_STRIP = com.jogamp.opengl.GL3.GL_LINE_STRIP;
    public static final int GL_TRIANGLES = com.jogamp.opengl.GL3.GL_TRIANGLES;
    public static final int GL_TRIANGLE_STRIP = com.jogamp.opengl.GL3.GL_TRIANGLE_STRIP;
    public static final int GL_TRIANGLE_FAN = com.jogamp.opengl.GL3.GL_TRIANGLE_FAN;

    public void glActiveTexture(int texture);
    public void glAttachShader(int program, int shader);
    public void glBindAttribLocation(int program, int index, String name);
    public void glBindBuffer(int target, int buffer);
    public void glBindFragDataLocation(int program, int colornumber, String name);
    public void glBindFramebuffer(int target, int buffer);
    public void glBindRenderbuffer(int target, int buffer);
    public void glBindTexture(int target, int texture);
    public void glBindVertexArray(int array);
    public void glBlendColor(float red, float green, float blue, float alpha);
    public void glBlendEquation(int mode);
    public void glBlendEquationSeparate(int cmode, int amode);
    public void glBlendFunc(int sfac, int dfac);
    public void glBlendFuncSeparate(int csfac, int cdfac, int asfac, int adfac);
    public void glBufferData(int target, long size, Buffer data, int usage);
    public void glBufferSubData(int target, long offset, long size, Buffer data);
    public int glCheckFramebufferStatus(int target);
    public void glClear(int mask);
    public void glClearColor(float r, float g, float b, float a);
    public void glClearDepth(double d);
    public void glColorMask(boolean r, boolean g, boolean b, boolean a);
    public void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a);
    public void glCompileShader(int shader);
    public int glCreateProgram();
    public int glCreateShader(int type);
    public void glDeleteBuffers(int count, int[] buffers, int n);
    public void glDeleteFramebuffers(int count, int[] buffers, int n);
    public void glDeleteShader(int id);
    public void glDeleteProgram(int id);
    public void glDeleteQueries(int count, int[] buffer, int i);
    public void glDeleteRenderbuffers(int count, int[] buffers, int n);
    public void glDeleteSync(long id);
    public void glDeleteTextures(int count, int[] buffers, int n);
    public void glDeleteVertexArrays(int count, int[] buffers, int n);
    public void glCullFace(int mode);
    public void glDebugMessageControl(int source, int type, int severity, int count, int[] ids, boolean enabled);
    public void glDepthFunc(int func);
    public void glDepthMask(boolean mask);
    public void glDisable(int cap);
    public void glDisablei(int cap, int index);
    public void glDisableClientState(int cap);
    public void glDisableVertexAttribArray(int location);
    public void glDrawBuffer(int buf);
    public void glDrawBuffers(int n, int[] bufs, int i);
    public void glDrawArraysInstanced(int mode, int first, int count, int primcount);
    public void glDrawArrays(int mode, int first, int count);
    public void glDrawElementsInstanced(int mode, int count, int type, long indices, int primcount);
    public void glDrawElements(int mode, int count, int type, long indices);
    public void glDrawRangeElements(int mode, int start, int end, int count, int type, long indices);
    public void glEnable(int cap);
    public void glEnablei(int cap, int index);
    public void glEnableClientState(int cap);
    public void glEnableVertexAttribArray(int location);
    public long glFenceSync(int condition, int flags);
    public void glFinish();
    public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level);
    public void glFramebufferRenderbuffer(int target, int attachment, int rbtarget, int renderbuffer);
    public void glGenBuffers(int n, int[] buffer, int i);
    public void glGenFramebuffers(int n, int[] buffer, int i);
    public void glGenQueries(int n, int[] buffer, int i);
    public void glGenTextures(int n, int[] buffer, int i);
    public void glGenVertexArrays(int n, int[] buffer, int i);
    public void glGetBufferSubData(int target, int offset, int size, ByteBuffer data);
    public int glGetDebugMessageLog(int count, int bufsize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, byte[] buffer);
    public int glGetError();
    public void glGetFloatv(int pname, float[] data);
    public void glGetIntegerv(int pname, int[] data);
    public String glGetString(int name);
    public void glGetProgramInfoLog(int shader, int maxlength, int[] length, byte[] infolog);
    public void glGetProgramiv(int shader, int pname, int[] buf, int i);
    public void glGetQueryObjectiv(int id, int pname, int[] params, int i);
    public void glGetQueryObjecti64v(int id, int pname, long[] params, int i);
    public void glGetShaderInfoLog(int shader, int maxlength, int[] length, byte[] infolog);
    public void glGetShaderiv(int shader, int pname, int[] buf, int i);
    public void glGetSynciv(long sync, int pname, int bufsize, int[] lengths, int i, int[] values, int o);
    public void glGetTexImage(int target, int level, int format, int type, Buffer pixels);
    public void glGetTexImage(int target, int level, int format, int type, long offset);
    public int glGetUniformLocation(int program, String name);
    public void glLineWidth(float w);
    public void glLinkProgram(int program);
    public void glObjectLabel(int identifier, int name, int length, byte[] label);
    public void glPixelStorei(int pname, int param);
    public void glPointSize(float size);
    public void glPolygonMode(int face, int mode);
    public void glPolygonOffset(float factor, float units);
    public void glQueryCounter(int id, int target);
    public void glReadBuffer(int buf);
    public void glReadPixels(int x, int y, int width, int height, int format, int type, Buffer data);
    public void glReadPixels(int x, int y, int width, int height, int format, int type, long offset);
    public void glRenderbufferStorage(int target, int format, int width, int height);
    public void glRenderbufferStorageMultisample(int target, int samples, int format, int width, int height);
    public void glSampleCoverage(float value, boolean invert);
    public void glScissor(int x, int y, int w, int h);
    public void glShaderSource(int shader, int count, String[] string, int[] lengths);
    public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, Buffer data);
    public void glTexSubImage2D(int target, int level, int xoff, int yoff, int width, int height, int format, int type, Buffer data);
    public void glTexImage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations);
    public void glTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, Buffer data);
    public void glTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int width, int height, int depth, int format, int type, Buffer data);
    public void glTexParameterf(int target, int pname, float param);
    public void glTexParameterfv(int target, int pname, float[] param, int n);
    public void glTexParameteri(int target, int pname, int param);
    public void glUniform1f(int location, float v0);
    public void glUniform2f(int location, float v0, float v1);
    public void glUniform3f(int location, float v0, float v1, float v2);
    public void glUniform3fv(int location, int count, float[] val, int n);
    public void glUniform4f(int location, float v0, float v1, float v2, float v3);
    public void glUniform4fv(int location, int count, float[] val, int n);
    public void glUniform1i(int location, int v0);
    public void glUniform2i(int location, int v0, int v1);
    public void glUniform3i(int location, int v0, int v1, int v2);
    public void glUniform4i(int location, int v0, int v1, int v2, int v3);
    public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value, int n);
    public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value, int n);
    public void glUseProgram(int program);
    public void glVertexAttribDivisor(int location, int divisor);
    public void glVertexAttribPointer(int location, int size, int type, boolean normalized, int stride, long pointer);
    public void glVertexAttribIPointer(int location, int size, int type, int stride, long pointer);
    public void glViewport(int x, int y, int w, int h);
}
