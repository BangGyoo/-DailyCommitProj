<!-- 기존의 깃허브와 연동해서 follow되어 있는 사람 위주로 찾는다. -->
<template>
    <v-main>
      <v-container
        class="py-8 px-6"
        fluid
      >
    <v-row>
        <v-col cols="12">
            <v-toolbar extended>
                    <v-btn elevation="2" outlined class="col-2">나의 팔로우</v-btn>
                    <v-text-field
                        label="깃허브에서 팔로우 할 id를 검색 해 주세요!" class="ml-3 mt-6"/>  
                <v-btn icon>
                    <v-icon>mdi-magnify</v-icon>
                </v-btn>
            </v-toolbar>
        </v-col>
    </v-row>
        <v-row>
          <v-col cols='12'>
            <v-card>
              <v-subheader>나의 팔로우</v-subheader>

              <v-list two-line>
                <template v-for="n in 6">
                  <v-list-item

                    :key="n"
                  >
                    <v-list-item-avatar color="grey darken-1">
                    </v-list-item-avatar>

                    <v-list-item-content>
                      <v-list-item-title>맴버 {{ n }}</v-list-item-title>

                      <v-list-item-subtitle>
                        {{n}} 번째 친구 내용
                      </v-list-item-subtitle>
                    </v-list-item-content>
                  </v-list-item>

                  <v-divider
                    v-if="n !== 6"
                    :key="`divider-${n}`"
                    inset
                  ></v-divider>
                </template>
              </v-list>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-main>   
</template>

