#version 330 core
in vec4 fColor;
in vec2 fTexCoord;
in float fTexID;

uniform sampler2D uTextures[8];
// to link a texture ID (value) and a texture unit (index)
uniform int uTextUnitTextIDLinkers[8];

out vec4 color;

void main() {
    //float noise = fract(sin(dot(fColor.xy ,vec2(12.9898,78.233))) * 43758.5453);
    //color = fColor * noise;
    int texUnitIndex;
    for (int i=0; i<8; i++) {
        if (uTextUnitTextIDLinkers[i]==int(fTexID)) texUnitIndex = i;
    }
    if (int(fTexID) != 0) {
        vec4 texel = fColor * texture(uTextures[texUnitIndex], fTexCoord);
        if(texel.a < 0.5) {
            discard;
        }
        color = texel;
        //color = vec4(fTexCoord ,0,1);
    } else {
        color = fColor;
    }
}