export PATH=/opt/homebrew/bin:$PATH
export NVM_DIR="$HOME/.nvm"
[ -s "/opt/homebrew/opt/nvm/nvm.sh" ] && \. "/opt/homebrew/opt/nvm/nvm.sh"  # This loads nvm
[ -s "/opt/homebrew/opt/nvm/etc/bash_completion.d/nvm" ] && \. "/opt/homebrew/opt/nvm/etc/bash_completion.d/nvm"  # This loads nvm bash_completion
export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
export CPPFLAGS="-I/opt/homebrew/opt/openjdk/include"

# Custom Alias
alias ll="ls -l --color"
alias la="ls -l -a --color"
alias cl="clear"
alias md="mkdir -p"

# >>> conda initialize >>>
# !! Contents within this block are managed by 'conda init' !!
__conda_setup="$('/Users/suvadeepghoshal/anaconda3/bin/conda' 'shell.zsh' 'hook' 2> /dev/null)"
if [ $? -eq 0 ]; then
    eval "$__conda_setup"
else
    if [ -f "/Users/suvadeepghoshal/anaconda3/etc/profile.d/conda.sh" ]; then
        . "/Users/suvadeepghoshal/anaconda3/etc/profile.d/conda.sh"
    else
        export PATH="/Users/suvadeepghoshal/anaconda3/bin:$PATH"
    fi
fi
unset __conda_setup
# <<< conda initialize <<<

