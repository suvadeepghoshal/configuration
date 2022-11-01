# Configuration

All my terminal configuration for my Macbook Pro

## Content

- Defualt shell for Mac OS is ZSH
  - .zshrc : for ZSH configurations. It is typically reserved for things that are not inheritable by subshells, such as aliases and functions, custom prompts, history customizations, and so on.
  - .zprofile : for exporting custom application paths or any custom user/profile changes. It is loaded only once at login time, it's best to put things that are loaded only once and can be inherited by subshells. An excellent example of this is environment variables.
  - .vimrc : for loading the vim configurations _based on personal preferences, I like to keep it fast so nothing fancy 😅_
