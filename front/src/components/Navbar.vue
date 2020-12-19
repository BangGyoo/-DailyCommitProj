<template>
  <div>
    <v-app-bar app>
      <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>

      <v-toolbar-title>그룹 일일커밋 스터디 플랫폼</v-toolbar-title>
    </v-app-bar>
    <v-navigation-drawer
      v-model="drawer"
      app
    >
      <v-sheet
        color="grey lighten-4"
        class="pa-4"
      >
        <v-avatar
          class="mb-4"
          color="grey darken-1"
          size="64"
        ></v-avatar>

        <div>banggyoo12@gmail.com(로그인 로그오프 기능 구현)</div>
      </v-sheet>

      <v-divider></v-divider>

      <v-list>
        <v-list-item
          v-for="[icon, text,pathName] in links"
          :key="icon"
          link
          router :to={name:pathName}
          exact
        >
          <v-list-item-icon>
            <v-icon>{{ icon }}</v-icon>
          </v-list-item-icon>
          <v-list-item-content>
            <v-list-item-title>{{ text }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
  </div>
</template>

<script>
export default {
    data: () => ({
      drawer: null,
      links: [
        ['mdi-account', '내 커밋리스트','myCommit'],
        ['mdi-account-multiple', '즐겨찾기 추가한 사람들','commitList'],
        ['mdi-delete', '즐겨찾기 추가','newMember'],
        ['mdi-calendar-check', '투두리스트','toDoList'],
      ],
    }),
}
</script>